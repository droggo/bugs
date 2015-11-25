package grails

import spock.lang.Specification

@Mock(DomainWithListPropertyName)
class DomainWithListPropertyNameSpec extends Specification {
	void 'ensure domain may be saved'(){
		expect:
		new DomainWithListPropertyName().save(failOnError: true)
	}
}