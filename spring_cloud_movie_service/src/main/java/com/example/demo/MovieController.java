package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	private static List<Movie> lst = new ArrayList<Movie>();
	static {
		 lst.add(new Movie(000,"Hero" , "horror"));
		 lst.add(new Movie(001,"Hero01" , "horror"));
		 lst.add(new Movie(002,"Hero02" , "horror"));
		 
		}
	
	@GetMapping("/movies")
	public ResponseEntity<?> getMovie(){
		
		return ResponseEntity.ok(lst);
	}
	
	
	@GetMapping("/movie/{id}")
    public ResponseEntity<?> getMovie(@PathVariable int id) {

        Movie movie = findMovie(id);
        if (movie == null) {
            return ResponseEntity.badRequest()
                .body("Invalid movie id");
        }

        return ResponseEntity.ok(movie);

    }

    private Movie findMovie(int id) {
        return lst.stream()
            .filter(movie -> movie.getId()
                .equals(id))
            .findFirst()
            .orElse(null);
}
}
