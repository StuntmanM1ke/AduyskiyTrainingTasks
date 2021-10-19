package wikiSearch_10_1;

import java.util.List;

public class Query {
    private Searchinfo searchinfo;
    private List<Search> search;

    public Searchinfo getSearchinfo() {
        return searchinfo;
    }

    public void setSearchinfo(Searchinfo searchinfo) {
        this.searchinfo = searchinfo;
    }

    public List<Search> getSearch() {
        return search;
    }

    public void setSearch(List<Search> search) {
        this.search = search;
    }
}
