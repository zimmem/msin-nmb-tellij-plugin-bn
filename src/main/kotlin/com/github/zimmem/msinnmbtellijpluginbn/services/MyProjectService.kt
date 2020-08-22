package com.github.zimmem.msinnmbtellijpluginbn.services

import com.intellij.openapi.project.Project
import com.github.zimmem.msinnmbtellijpluginbn.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
