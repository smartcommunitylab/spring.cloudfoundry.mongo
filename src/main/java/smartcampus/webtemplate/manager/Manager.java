package smartcampus.webtemplate.manager;

import java.util.List;

import javax.annotation.PostConstruct;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class Manager {

	@Autowired
	MongoTemplate db;

	@PostConstruct
	@SuppressWarnings("unused")
	private void initEnv() {

		if (db.findAll(Volunteer.class).size() == 0) {
			Volunteer v = new Volunteer();
			v.setId(new ObjectId().toString());
			v.setFullname("volontario 1");
			db.save(v);

			v = new Volunteer();
			v.setId(new ObjectId().toString());
			v.setFullname("volontario 2");
			db.save(v);

			v = new Volunteer();
			v.setId(new ObjectId().toString());
			v.setFullname("volontario 3");
			db.save(v);
		}
	}

	public List<Volunteer> getVolunteers() {
		return db.findAll(Volunteer.class);
	}
}
