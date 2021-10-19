package wikiSearch_10_1;

import java.util.List;

public class Root {
    private String batchcomplete;
    //private List<Continue> continuE;
    private Query query;

    public String getBatchcomplete() {
        return batchcomplete;
    }

    public void setBatchcomplete(String batchcomplete) {
        this.batchcomplete = batchcomplete;
    }

   /* public List<Continue> getContinuE() {
        return continuE;
    }

    public void setContinuE(List<Continue> continuE) {
        this.continuE = continuE;
    }*/

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
}
