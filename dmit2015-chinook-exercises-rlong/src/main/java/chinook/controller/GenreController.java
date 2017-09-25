package chinook.controller;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.GenreRepository;
import chinook.model.Genre;

@Model
public class GenreController {
		
		@Inject
		private GenreRepository GenreRepository;
		
		//private List<Genre> Genres; //getter
		
		//@PostConstruct
		//void init() {
		//	Genres = GenreRepository.findAll();
		//}

		public List<Genre> getGenres() {
			//return Genres;
			return GenreRepository.findAll();
		}
		
		public List<Genre> retrieveAllGenres(){
			return GenreRepository.findAll();
		}
}
