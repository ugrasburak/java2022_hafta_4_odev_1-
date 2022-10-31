package kodlama.io.Kodlama.io.Devs.business.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;	
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	@Override
	public List<Language> getAll() {
		//iş kuralları
		//bir kişinin getAll yapabilmesi için kurallarımız buraya yazılır		
		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) throws Exception{
		if (language.getName().isEmpty()) {
			throw new Exception("İsim boş bırakılamaz");			
		}
		else {
			for (int i = 0; i < languageRepository.getAll().size(); i++) {
				if (languageRepository.getAll().get(i).getName().equals(language.getName())) {
					throw new Exception("Bu isim zaten var");
				}
				else {
					languageRepository.add(language);
				}					
			}
		}
	}

	@Override
	public void delete(Language language) {
		languageRepository.delete(language);
	}

	@Override
	public void update(Language language,String updatedName) throws Exception {
		//Update kısmı tam olarak istenildiği gibi çalışmıyor
		
		language.getName();
			for (int i = 0; i < languageRepository.getAll().size(); i++) {
				if (languageRepository.getAll().get(i).getName().equals(language.getName())) {
					throw new Exception("Bu isim zaten var");
				}
				else {
					languageRepository.update(language, updatedName);
				}					
			}
	}
	

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}

}
