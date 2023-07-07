package com.api.rest.prac;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.entity.Pokemon;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class PokemonRestController {
	
	private List<Pokemon> thePokemons;
	
	//define the postConstruct to load data
	
	@PostConstruct
	public void loadData() {
		

		thePokemons = new ArrayList<>();
		
		thePokemons.add(new Pokemon("Pikachu", "Electric"));
		thePokemons.add(new Pokemon("Charlizard", "Fire"));
		thePokemons.add(new Pokemon("Bulbasaur", "Grass"));		
		
	}
	
	@GetMapping("/pokemons")
	public List<Pokemon> getPokemons() {
		
		return thePokemons;
		
	}
	
	
	// define endpoint 
	
	@GetMapping("/pokemons/{pokemonId}")
	public Pokemon getPokemon(@PathVariable int pokemonId) {
		
		//check the pokemonId again list size
		if ( (pokemonId >= thePokemons.size()) || (pokemonId < 0)) {
			throw new PokemonNotFoundException("Pokemon id not found - " + pokemonId);
		}
		
		
		return thePokemons.get(pokemonId);
		
	}
	

}
