class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"usuario/login")
        "500"(view:'/error')
		"404"(view:'/error404')
	}
}
