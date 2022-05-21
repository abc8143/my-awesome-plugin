package com.github.abc8143.myawesomeplugin.services

import com.intellij.openapi.project.Project
import com.github.abc8143.myawesomeplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
