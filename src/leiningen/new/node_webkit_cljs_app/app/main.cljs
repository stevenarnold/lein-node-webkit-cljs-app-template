(ns {{name}}.core
	(:require [jayq.core :as jq]))

(def $content (jq/$ :#content))
	
(jq/document-ready 
	(.html $content "Your new project {{name}} is ready to go!"))