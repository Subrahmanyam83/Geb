package Specs

import Pages.SubrahmanyamPage
import geb.spock.GebSpec

/**
 * Created by subramaniam on 12/8/2015.
 */
class SubrahmanyamSpec extends GebSpec {

    def "First Subrahmanyam's Test Case"() {
        setup: "Landing to the Home Page"
        to SubrahmanyamPage
    }
}