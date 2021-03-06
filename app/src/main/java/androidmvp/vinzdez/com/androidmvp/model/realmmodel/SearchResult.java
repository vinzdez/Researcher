package androidmvp.vinzdez.com.androidmvp.model.realmmodel;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by Vicente Angcaway on 22/12/2016.
 */

public class SearchResult extends RealmObject {
    //A default public constructor with no argument must be declared if a custom constructor is declared.
    public SearchResult() {
    }

    private RealmList<SearchResultRealm> searchResultResponseList;
    private String key;

    public SearchResult(RealmList<SearchResultRealm> searchResultResponseList, String key) {
        this.searchResultResponseList = searchResultResponseList;
        this.key = key;
    }

    public RealmList<SearchResultRealm> getSearchResultResponseList() {
        if (searchResultResponseList == null) {
            this.searchResultResponseList = new RealmList<>();
        }
        return searchResultResponseList;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
