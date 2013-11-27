(ns leiningen.new.node-webkit-cljs-app
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "node-webkit-cljs-app"))
			
(defn node-webkit-cljs-app
  "Create a new Node-Webkit Clojurescript app project"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating new node-webkit-cljs-app project..")
    (->files data
             ["project.clj" (render "project.clj" data)]
			 ["README.txt" (render "README.txt")]
             ["LICENSE" (render "LICENSE")]
			 ["package.json" (render "package.json")]
             ["index.html" (render "index.html")]
			 ["resources/css/main.css" (render "main.css")]
			 ["resources/scripts/jquery-1.9.1.js" (render "jquery-1.9.1.js")]
			 ["resources/scripts/jquery-1.9.1.min.js" (render "jquery-1.9.1.min.js")]
			 ["resources/scripts/jquery-1.9.1.min.map" (render "jquery-1.9.min.map")]
			 ["externs/jquery-1-9.externs.js" (render "jquery-1.9.externs.js")]
             ["src/{{sanitized}}/main.cljs" (render "main.cljs" data)])
    (main/info 
		"See README.txt if you are new to Node-Webkit and how to use this project template."
		"You can start the Clojurescript compiler with `lein cljsbuild auto dev`")))