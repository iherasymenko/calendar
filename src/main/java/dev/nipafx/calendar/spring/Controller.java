package dev.nipafx.calendar.spring;

import dev.nipafx.calendar.data.Repository;
import dev.nipafx.calendar.entries.Category;
import dev.nipafx.calendar.entries.Entry;
import dev.nipafx.calendar.entries.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static java.util.Objects.requireNonNull;

@ResponseBody
@RequestMapping("/api")
public class Controller {

	private final Repository repository;

	public Controller(Repository repository) {
		this.repository = requireNonNull(repository);
	}

	@GetMapping("/entry")
	public List<Entry> getEntries() {
		return repository.allEntries();
	}

	@GetMapping("/person")
	public List<Person> getPersons() {
		return repository.allPersons();
	}

	@GetMapping("/category")
	public List<Category> getCategories() {
		return repository.allCategories();
	}

}
