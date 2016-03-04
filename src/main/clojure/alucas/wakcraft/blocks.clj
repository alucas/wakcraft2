(ns alucas.wakcraft.blocks
  (:require
    [forge-clj.blocks :refer [defblock]]
    [forge-clj.items :refer [deftab]]
    [forge-clj.registry :refer [register]]))

(deftab tab-block)

(defmacro def-wakcraft-block
  [name block-name & options]
  (let [options (apply hash-map options)
        options (assoc options :unlocalized-name (str "wakcraft." block-name)
                               :creative-tab tab-block
                               :hardness -1)
        options (flatten (into '() options))
        options (cons name options)]
    `(defblock ~@options)))

;(def-wakcraft-block box "Box")
(defblock box :unlocalized-name "wakcraft.Box" :creative-tab tab-block)

(defn register-blocks
  "Register Wakcraft blocks"
  []
  (register box "blockBox"))