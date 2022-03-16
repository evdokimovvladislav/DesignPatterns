package com.example.designpatterns.behavioral.command.ui

import com.example.designpatterns.behavioral.command.App
import com.example.designpatterns.behavioral.command.commands.Command

class UndoButton(app: App, command: Command) : Button(app, command)