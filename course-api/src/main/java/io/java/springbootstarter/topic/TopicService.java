package io.java.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> allTopics = new ArrayList<>(Arrays.asList(
				
				new Topic("A", "B", "C"),
				new Topic("1", "2","3"),
				new Topic("Tay", "Ed", "Ma")
				
				));
	
	public List<Topic> getAllTopics (){
		return allTopics;
	}
	
	public Topic getTopic(String id) {
		return allTopics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		allTopics.add(topic);
	}
	

}
