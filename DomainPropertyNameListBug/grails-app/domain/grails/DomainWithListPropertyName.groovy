package grails

/**
 * Domain class with property named 'list'
 * @Mock will not work in unit test for such domain class (it worked in 2.4.2)
 */
class DomainWithListPropertyName {

	String list

    static constraints = {
    	list nullable: true
    }
}
