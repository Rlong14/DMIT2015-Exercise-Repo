package chinook.controller;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.PlaylistRepository;
import chinook.model.Playlist;

@Model
public class PlaylistController {
		
		@Inject
		private PlaylistRepository PlaylistRepository;
		
		//private List<Playlist> Playlists; //getter
		
		//@PostConstruct
		//void init() {
		//	Playlists = PlaylistRepository.findAll();
		//}

		public List<Playlist> getPlaylists() {
			//return Playlists;
			return PlaylistRepository.findAll();
		}
		
		public List<Playlist> retrieveAllPlaylists(){
			return PlaylistRepository.findAll();
		}
}
