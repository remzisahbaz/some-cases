package com.sahabt.library.applications;

import java.util.Optional;

import com.sahabt.library.domain.catalog.Author;
import com.sahabt.library.domain.catalog.Available;
import com.sahabt.library.domain.catalog.BookId;
import com.sahabt.library.domain.catalog.Catalog;
import com.sahabt.library.domain.catalog.ISBN;
import com.sahabt.library.domain.catalog.Language;
import com.sahabt.library.domain.catalog.Periodical;
import com.sahabt.library.domain.catalog.PublishDate;
import com.sahabt.library.domain.catalog.PublishingHouse;
import com.sahabt.library.domain.catalog.Title;
import com.sahabt.library.domain.catalog.Topic;
import com.sahabt.library.domain.catalog.Type;
import com.sahabt.library.domain.catalog.UseTarget;

public interface CatalogApplication {

	Optional<Catalog> addCatalog(Catalog catalog);
	Optional<Catalog> removeCatalog(BookId bookId);
	Optional<Catalog> editCatalog(Catalog catalog);
	Optional<Catalog> getInformationBook(BookId bookId);
	Optional<Catalog> FindBookByIsbn(ISBN isbn);
	Optional<Catalog> FindBookByAuthor(Author author);
	Optional<Catalog> FindBookByTitle(Title title);
	Optional<Catalog> FindBookByPublishDate(PublishDate publishDate);
	Optional<Catalog> FindBookByPublishigHouse(PublishingHouse publishingHouse);
	Optional<Catalog> FindBookByLanguage(Language language);
	Optional<Catalog> FindBookByType(Type type);
	Optional<Catalog> FindBookByTopic(Topic topic);
	Optional<Catalog> FindBookByUseTarget(UseTarget useTarget);
	Optional<Catalog> FindBookByPeriodical(Periodical periodical);
	Optional<Catalog> FindBookByAvailable(Available available);
}
