#!/bin/bash

problem_no="$1"
problem_name="$2"
base=$(dirname "$0")
package_path="com/raphael/lc/$problem_no"
src_file_path="src/$package_path"
test_file_path="test/$package_path"
problem_name_upper_case=$(echo "$problem_name" | awk '{print toupper(substr($0,0,1))substr($0,2)}')
problem_name_lower_case=$(echo "$problem_name" | awk '{print tolower(substr($0,0,1))substr($0,2)}')
time=$(date '+%Y-%m-%d %H:%M:%S')
test_class_name="$problem_name_upper_case"Test
src_file_name="$problem_name_upper_case".java
test_file_name="$test_class_name.java"

cd "$base" || exit
cd ..

root_dir=$(pwd)

mkdir -p "$src_file_path"
cd "$src_file_path" || exit

# create src java file
cat <<EOF > "$src_file_name"
package com.raphael.lc.$problem_no;

/**
 * @author raphael
 * @date $time
 */
class $problem_name_upper_case {
    /**
     * Description for $problem_name_upper_case:
     *
     */
    public int $problem_name_lower_case() {
        // code
        return 0;
    }
}
EOF

echo "$src_file_name.java for problem - $problem_name_upper_case created."

cd "$root_dir" || exit
mkdir -p "$test_file_path"
cd "$test_file_path" || exit

# create test java file
cat <<EOF > "$test_file_name"
package com.raphael.lc.$problem_no;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author raphael
 * @date $time
 */
class $test_class_name {

    private final $problem_name_upper_case solution = new $problem_name_upper_case();

    @Test
    void t1() {
        Assertions.assertEquals(0, solution.$problem_name_lower_case());
    }
}
EOF

echo "$test_file_name.java for problem - $problem_name_upper_case created."
