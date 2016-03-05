(ns alucas.wakcraft.tabs
  (:require
    [forge-clj.items :refer [deftab]]
    [forge-clj.util :refer [get-item]]))

(defmacro def-tab-icon
  ""
  [var item-name]
  `(deftab ~var
           :override {:get-tab-icon-item (fn [] (get-item ~item-name))}))

(def-tab-icon tab-block "minecraft:stone")