(ns alucas.wakcraft.blocks
  (:require
    [forge-clj.blocks :refer [defblock]]
    [forge-clj.registry :refer [register]]
    [alucas.wakcraft.tabs :refer [tab-block]])
  (:import
    [net.minecraft.block.material Material]))

(def modid_ "wakcraft.")

(defmacro def-generic-block
  "Def block with generic properties"
  [var name material tab & properties]
  (let [properties (apply hash-map properties)
        properties (assoc properties :unlocalized-name (str modid_ name)
                                     :material material
                                     :creative-tab tab
                                     :hardness -1)
        properties (flatten (into '() properties))]
    `(defblock ~var ~@properties)))

(defmacro def-and-register-block
  "Def and register generic block"
  [var name & args]
  `(do
     (def-generic-block ~var ~name ~@args)
     (register ~var (str "block" ~name))))

(defn register-blocks
  "Register Wakcraft blocks"
  []
  (do
    (def-and-register-block box "Box" Material/wood tab-block)
    (def-and-register-block debug "Debug" Material/wood tab-block)))