(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2120"]
				 [jayq "2.5.0"]]
  :plugins [[lein-cljsbuild "1.0.1-SNAPSHOT"]
			[org.bodil/lein-noderepl "0.1.10"]]
  :cljsbuild {
    :builds {
             :dev {:source-paths ["src"]
                   :compiler {:output-dir "resources/scripts"
							  :output-to "resources/scripts/main.js"
                              :source-map "resources/scripts/main.js.map"
							  :optimizations :whitespace
                              :pretty-print true}}
             :prod {:source-paths ["src"]
                    :compiler {:output-to "resources/scripts/main.js"
                               :optimizations :advanced
							   :externs ["externs/jquery.js"]}}}})