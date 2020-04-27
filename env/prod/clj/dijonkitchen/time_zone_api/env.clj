(ns dijonkitchen.time-zone-api.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[time-zone-api started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[time-zone-api has shut down successfully]=-"))
   :middleware identity})
