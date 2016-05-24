public interface ListOperationsMeasureAble {
    double measureAddByIndexOperationEfficiency();

    double measureGetByIndexOperationEfficiency();

    double measureRemoveByIndexOperationEfficiency();

    double measureIteratorAddOperationEfficiency();

    double measureIteratorRemoveOperationEfficiency();
}