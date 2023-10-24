/*
 * Copyright: Carlos F. Heuberger. All rights reserved.
 *
 */
package cfh.jgraphviz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Carlos F. Heuberger, 2023-10-06
 *
 */
public sealed interface ArrowType {
    //
}

/**
 * @author Carlos F. Heuberger, 2023-10-06
 *
 */
final class ArrowTypeImpl implements ArrowType, Valuable {

    private final List<String> shapes;
    
    ArrowTypeImpl(String... shapes) {
        this.shapes = Collections.unmodifiableList( new ArrayList<>( Arrays.asList(shapes) ) );
    }
    
    @Override
    public String value() {
        return '"' + String.join("", shapes) + '"';
    }
}
