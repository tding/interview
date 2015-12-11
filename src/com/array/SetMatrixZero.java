package com.array;

public class SetMatrixZero {
	//Given a m * n matrix, if an element is 0, set its entire row and column to 0.
	public void SetZero(int[][] matrix){
		boolean first_row = false;
		boolean first_column = false;
		
		//first column
		for(int i=0;i<matrix.length;i++){
			if(matrix[i][0] == 0){
				first_column = true;
				break;
			}
		}
		
		//first column
		for(int i=0;i<matrix[0].length;i++){
			if(matrix[0][i] == 0){
				first_row = true;
				break;
			}
		}
		
		for(int i=1;i<matrix.length;i++){
			for(int j=1;j<matrix[0].length;j++){
				if(matrix[i][j] == 0){
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		
		for(int i=1;i<matrix.length;i++){
			for(int j=1;j<matrix[0].length;j++){
				if(matrix[i][0] == 0 || matrix[0][j] == 0){
					matrix[i][j] = 0;
				}
			}
		}
		
		if(first_row){
			for(int i=0;i<matrix[0].length;i++){
				matrix[0][i] = 0 ;	
			}
		}
		
		if(first_column){
			for(int i=0;i<matrix.length;i++){
				matrix[i][0] = 0;	
			}
		}
		
	}
}
