package com.abaferastech.animatepizza.screen

interface PizzaInteractionListener {

    fun onChangePizzaSize(position: Int, size: Float)

    fun onIngredientsPizzaClick(ingredientPosition: Int, pizzaPosition: Int)
}