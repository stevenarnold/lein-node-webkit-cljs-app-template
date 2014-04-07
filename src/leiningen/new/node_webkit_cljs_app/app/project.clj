(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2202"]]
  :plugins [[lein-cljsbuild "1.0.3"]
			[org.bodil/lein-noderepl "0.1.11"]]
  :cljsbuild {
    :builds {
             :dev {:source-paths ["src"]
									 :compiler {:output-to "resources/scripts/main.js"
									 :optimizations :whitespace
									 :pretty-print true}}}})