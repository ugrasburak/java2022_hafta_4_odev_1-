package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	public void add(Language language) throws Exception;
	public void delete(Language language);
	public void update(Language language,String updatedName) throws Exception;
	Language getById(int id);
	List<Language> getAll();
}
