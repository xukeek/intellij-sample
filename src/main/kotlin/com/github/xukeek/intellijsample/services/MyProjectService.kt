package com.github.xukeek.intellijsample.services

import com.intellij.openapi.project.Project
import com.github.xukeek.intellijsample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
