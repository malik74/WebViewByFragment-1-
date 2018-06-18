package awaludinar.material.design;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by msahakyan on 22/10/15.remod Awaludin
 */
public class ExpandableListDataSource {

    /**
     * Returns fake data of films
     *
     * @param context
     * @return
     */
    public static Map<String, List<String>> getData(Context context) {
        Map<String, List<String>> expandableListData = new TreeMap<>();

        List<String> filmGenres = Arrays.asList(context.getResources().getStringArray(R.array.title));

        List<String> List1 = Arrays.asList(context.getResources().getStringArray(R.array.list1));
        List<String> List2 = Arrays.asList(context.getResources().getStringArray(R.array.list2));
        List<String> List3 = Arrays.asList(context.getResources().getStringArray(R.array.list3));
		expandableListData.put(filmGenres.get(0), List1);
        expandableListData.put(filmGenres.get(1), List2);
        expandableListData.put(filmGenres.get(2), List3);

        return expandableListData;
    }
}
