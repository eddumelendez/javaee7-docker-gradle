package org.javaee7.sample;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * @author eddumelendez
 */
@Path("heros")
public class HeroResources {

	@Inject
	private HeroServices heroServices;

	@GET
	@Produces("application/json")
	public List<String> list() {
		return this.heroServices.findAll();
	}

}
