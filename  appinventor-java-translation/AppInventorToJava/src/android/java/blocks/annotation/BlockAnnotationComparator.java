/*
   appinventor-java-translation

   Originally authored by Joshua Swank at the University of Alabama
   Work supported in part by NSF award #0702764 and a Google 2011 CS4HS award

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package android.java.blocks.annotation;

import java.util.Comparator;

/**
 *
 * @author Joshua
 */
public class BlockAnnotationComparator implements Comparator<BlockAnnotation>
{
    public int compare( BlockAnnotation a1, BlockAnnotation a2 )
    {
        int operationComparison = a1.genusRelation().compareTo( a2.genusRelation() );
        
        if( operationComparison == 0 )
            return a1.genus().compareTo( a2.genus() );
        else
            return operationComparison;
    }
}
