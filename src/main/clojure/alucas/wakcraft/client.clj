(ns alucas.wakcraft.client
  (:require
    [alucas.wakcraft.blocks :as blocks]
    [clojure.string :refer [replace-first]]
    [forge-clj.registry :refer [register]])
  (:import
    [net.minecraftforge.client.model ModelLoader]
    [net.minecraft.block Block]
    [net.minecraft.client.resources.model ModelResourceLocation]
    [net.minecraft.item Item ItemBlock]))

(defmulti register-model
          (fn [element & args] [(type element)]))

(defmethod register-model [Block]
  [^Block block]
  (register-model (Item/getItemFromBlock block)))

(defmethod register-model [ItemBlock]
  [^ItemBlock item-block]
  (let [^String resource-name (replace-first (subs (.getUnlocalizedName item-block) 5) #"\." ":block")]
    (ModelLoader/setCustomModelResourceLocation item-block 0 (ModelResourceLocation. resource-name "inventory"))))

(defn client-pre-init
  [this event]
  (do
    (register-model blocks/box)
    (register-model blocks/debug)))

(defn client-init
  [this event])
