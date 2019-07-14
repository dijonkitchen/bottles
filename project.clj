(defproject bottles "1.0.1"
  :description "99 Bottles of Beer"
  :url "https://github.com/dijonkitchen/bottles"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :plugins [[jonase/eastwood "0.3.5"]
            [lein-cljfmt "0.6.4"]
            [lein-cloverage "1.1.1"]
            [lein-kibit "0.1.6"]]
  :main ^:skip-aot bottles.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:eastwood {:linters [:all]}}})
