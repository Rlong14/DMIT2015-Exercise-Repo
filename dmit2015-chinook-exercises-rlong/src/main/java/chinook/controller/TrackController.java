package chinook.controller;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.TrackRepository;
import chinook.model.Track;

@Model
public class TrackController {
		
		@Inject
		private TrackRepository TrackRepository;
		
		//private List<Track> Tracks; //getter
		
		//@PostConstruct
		//void init() {
		//	Tracks = TrackRepository.findAll();
		//}

		public List<Track> getTracks() {
			//return Tracks;
			return TrackRepository.findAll();
		}
		
		public List<Track> retrieveAllTracks(){
			return TrackRepository.findAll();
		}
}
