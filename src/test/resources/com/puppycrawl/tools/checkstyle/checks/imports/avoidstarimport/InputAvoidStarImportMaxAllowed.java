/*
AvoidStarImport
excludes = (default)
allowClassImports = (default)false
allowStaticMemberImports = (default)false
maxAllowed = 1


*/

package com.puppycrawl.tools.checkstyle.checks.imports.avoidstarimport;

import java.io.*;
import java.lang.*; // violation, 'Only '1' star import is allowed per file.'
import static java.io.File.*; // violation, 'Only '1' star import is allowed per file.'

public class InputAvoidStarImportMaxAllowed {

}

