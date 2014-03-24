(ns leiningen.new.node-webkit-cljs-app
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]
			[clojure.java.io :as io]
			[clojure.string :as str]))

(def render (renderer "node-webkit-cljs-app"))

; The binary function is borrowed from the http_kit lein project template
; https://github.com/http-kit/lein-template/blob/master/src/leiningen/new/http_kit.clj		
(defn binary [file]
  (io/input-stream (io/resource(str/join "/" ["leiningen" "new" "node_webkit_cljs_app" file]))))
	
(defn node-webkit-cljs-app
  "Create a new Node-Webkit Clojurescript app project"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating new node-webkit-cljs-app project..")
    (->files data
             ["{{name}}/project.clj" (render "app/project.clj" data)]
			 ["{{name}}/README.txt" (render "app/README.txt")]
             ["{{name}}/LICENSE" (render "app/LICENSE")]
			 ["{{name}}/package.json" (render "app/package.json")]
             ["{{name}}/index.html" (render "app/index.html")]
			 ["{{name}}/resources/css/main.css" (render "app/main.css")]
			 ["{{name}}/resources/scripts/jquery-2.1.0.js" (render "app/jquery-2.1.0.js")]
			 ["{{name}}/resources/scripts/jquery-2.1.0.min.js" (render "app/jquery-2.1.0.min.js")]
             ["{{name}}/src/{{sanitized}}/main.cljs" (render "app/main.cljs" data)]
             ["{{name}}/src/jayq/core.cljs" (render "jayq/core.cljs" data)]
             ["{{name}}/src/jayq/macros.clj" (render "jayq/macros.clj" data)]
             ["{{name}}/src/jayq/util.cljs" (render "jayq/util.cljs" data)]
			 ["credits.html" (render "node-webkit/credits.html")]
			 ["ffmpegsumo.dll" (binary "node-webkit/ffmpegsumo.dll")]
			 ["icudt.dll" (binary "node-webkit/icudt.dll")]
			 ["libEGL.dll" (binary "node-webkit/libEGL.dll")]
			 ["libGLESv2.dll" (binary "node-webkit/libGLESv2.dll")]
			 ["nw.exe" (binary "node-webkit/nw.exe")]
			 ["nw.pak" (binary "node-webkit/nw.pak")]
			 ["nwsnapshot.exe" (binary "node-webkit/nwsnapshot.exe")])			 
    (main/info 
		"See README.txt if you are new to Node-Webkit and how to use this project template."
		"You can start the Clojurescript compiler with `lein cljsbuild auto dev`")))