(ns dijonkitchen.time-zone-api.routes.home
  (:require
   [dijonkitchen.time-zone-api.layout :as layout]
   [clojure.java.io :as io]
   [dijonkitchen.time-zone-api.middleware :as middleware]
   [ring.util.response]
   [ring.util.http-response :as response]))

(defn home-page [request]
  (layout/render request "home.html" {:docs (-> "docs/docs.md" io/resource slurp)}))

(defn about-page [request]
  (layout/render request "about.html"))

(defn home-routes []
  [""
   {:middleware [middleware/wrap-csrf
                 middleware/wrap-formats]}
   ["/" {:get home-page}]
   ["/about" {:get about-page}]])

