/*
 * Copyright 2014-2015 Mikhail Shugay
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.antigenomics.migmap.post.analysis

import com.antigenomics.migmap.clonotype.Clonotype
import com.milaboratory.core.sequence.NucleotideSequence

class CdrNode {
    final Clonotype representative
    final NucleotideSequence cdr3
    final List<Clonotype> clonotypes = new ArrayList<>()

    CdrNode(Clonotype clonotype) {
        this.representative = clonotype
        this.cdr3 = new NucleotideSequence(clonotype.cdr3nt)
    }
}
