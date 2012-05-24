package de.scandio.dresscode;

import de.scandio.dresscode.validators.IntegerValidator;
import de.scandio.dresscode.validators.TextValidator;

/**
 * TODO: description
 *
 * @author Georg Schmidl <georg.schmidl@scandio.de>
 */
public interface ArticleForm extends Form {

    Field<String, TextValidator> getTitle();

    Field<Integer, IntegerValidator> getNumber();

    ListField<Integer, IntegerValidator> getNumbers();
}
