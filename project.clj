(defproject vzaramel/whatsapp "0.1.1-SNAPSHOT"
  :description "whatsapp web client"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :source-paths ["src/clj"]
  :dependencies [[com.taoensso/timbre "4.10.0"]
                 [buddy "2.0.0"]
                 [clj-time "0.14.2"]
                 [slingshot "0.12.2"]
                 [stylefruits/gniazdo "1.0.1"]
                 [cheshire "5.8.0"]
                 [caesium "0.10.0"]
                 [net.glxn.qrgen/javase "2.0"]
                 [gloss "0.2.6"]
                 [clojusc/protobuf "3.5.1-v1.1-SNAPSHOT"]
                 [proto.whatsapp "0.1.1"]
                 [org.clojure/core.async "0.4.474"]]
  :profiles {:1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :dev {:dependencies [[org.clojure/clojure "1.9.0"]
                                  [org.clojure/test.generative "0.1.4"]
                                  [org.clojure/test.check "0.9.0"]
                                  [org.clojure/tools.namespace "0.2.1"]]}}
  :aliases {"all" ["with-profile" "dev:1.8"]})
