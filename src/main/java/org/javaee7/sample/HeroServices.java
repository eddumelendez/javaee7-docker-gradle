package org.javaee7.sample;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

/**
 * @author eddumelendez
 */
@Singleton
public class HeroServices {

	private List<String> heros;

	@PostConstruct
	public void init() {
		this.heros = Arrays.asList("Captain America", "Hulk", "Iron Man", "Thor");
	}

	public List<String> findAll() {
		return this.heros;
	}

}
