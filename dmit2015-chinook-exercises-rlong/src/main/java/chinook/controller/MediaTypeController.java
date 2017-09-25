package chinook.controller;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.MediaTypeRepository;
import chinook.model.MediaType;

@Model
public class MediaTypeController {
		
		@Inject
		private MediaTypeRepository MediaTypeRepository;
		
		//private List<MediaType> MediaTypes; //getter
		
		//@PostConstruct
		//void init() {
		//	MediaTypes = MediaTypeRepository.findAll();
		//}

		public List<MediaType> getMediaTypes() {
			//return MediaTypes;
			return MediaTypeRepository.findAll();
		}
		
		public List<MediaType> retrieveAllMediaTypes(){
			return MediaTypeRepository.findAll();
		}
}
