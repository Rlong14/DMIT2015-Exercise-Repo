package chinook.controller;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.AlbumRepository;
import chinook.model.Album;

@Model
public class AlbumController {
		
		@Inject
		private AlbumRepository albumRepository;
		
		//private List<album> albums; //getter
		
		//@PostConstruct
		//void init() {
		//	albums = albumRepository.findAll();
		//}

		public List<Album> getalbums() {
			//return albums;
			return albumRepository.findAll();
		}
		
		public List<Album> retrieveAllalbums(){
			return albumRepository.findAll();
		}
}
