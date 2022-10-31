package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	public void add(Language language);
	public void delete(Language language);
	public void update(Language language,String updatedName);
	Language getById(int id);
	List<Language> getAll();
}
