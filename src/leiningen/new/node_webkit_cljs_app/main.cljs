(ns {{name}}.core
	(:use [jayq.core :only [$]])
	(:require [jayq.core :as jq]))

(def $content ($ :#content))
	
(jq/document-ready 
	(.html $content "Your new project {{name}} is ready to go!"))