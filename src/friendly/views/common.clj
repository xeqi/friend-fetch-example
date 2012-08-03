(ns friendly.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-js include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "friendly"]
               (include-css "/css/reset.css")
               (include-js "/main.js")]
              [:body {:onload "friendly.client.setuser()"}
               [:div#wrapper
                content]]))
