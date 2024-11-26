/*
 * Copyright (c) 2013-2024 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package lapr4.jobs4u.app.backoffice.console.presentation.candidate;

import eapli.framework.visitor.Visitor;
import lapr4.jobs4u.candidatemanagement.domain.Candidate;


@SuppressWarnings({"squid:S106"})
public class CandidatePrinter implements Visitor<Candidate> {

    @Override
    public void visit(final Candidate candidate) {
        System.out.printf("%-25s%-20s%-20s", candidate.emailAddress(), candidate.firstName(),
                candidate.lastName());
    }

    public void printInfoCandidate(final Candidate candidate) {
        System.out.printf("%-25s%-20s%-20s\n", candidate.emailAddress(), candidate.firstName(),
                candidate.lastName());
    }

    public void printAllInfoCandidate(final Candidate candidate) {
        System.out.printf("\n1. %-25s%-20s%-20s%-20s\n", candidate.emailAddress(), candidate.firstName(),
                candidate.lastName(), candidate.phoneNumber());
        System.out.println();
    }
}
