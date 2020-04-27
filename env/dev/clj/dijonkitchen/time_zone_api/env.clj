(ns dijonkitchen.time-zone-api.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [dijonkitchen.time-zone-api.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[time-zone-api started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[time-zone-api has shut down successfully]=-"))
   :middleware wrap-dev})
