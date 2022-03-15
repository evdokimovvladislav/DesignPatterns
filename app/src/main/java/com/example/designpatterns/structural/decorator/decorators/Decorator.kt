package com.example.designpatterns.structural.decorator.decorators

import com.example.designpatterns.structural.decorator.shapes.Shape

/**
 * @author Evdokimov on 04.03.2022.
 */
abstract class Decorator(protected val shape: Shape) : Shape