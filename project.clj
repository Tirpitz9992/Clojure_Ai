(defproject test_clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.tensorflow/tensorflow "1.15.0"]
                 [ring/ring-core "1.9.3"]
                 [ring/ring-jetty-adapter "1.9.3"]
                 [org.clojure/java.jdbc "0.7.9"]
                 [org.postgresql/postgresql "42.2.5"]
                 [buddy/buddy-hashers "2.0.167"]
                 [compojure "1.6.2"]
                 [ring/ring-json "0.5.0"]
                 [ring-cors "0.1.13"]]
  :repl-options {:init-ns app.server})
